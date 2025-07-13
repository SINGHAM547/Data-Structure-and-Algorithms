/* Structure of Node
class Node {
  public:
    int data;
    Node *next;
    Node *prev;

    Node(int val) {
        data = val;
        this->next = NULL;
        this->prev = NULL;
    }
};
*/

class Solution {
public:
    Node* deleteNode(Node* head, int x) {
        if (head == nullptr || x < 1) {
            return head;
        }
        
        Node* current = head;
        
        // Case 1: Deleting the head node
        if (x == 1) {
            head = head->next;
            if (head != nullptr) {
                head->prev = nullptr;
            }
            delete current;
            return head;
        }
        
        // Traverse to the node at position x
        int count = 1;
        while (current != nullptr && count < x) {
            current = current->next;
            count++;
        }
        
        // If position is beyond the list length
        if (current == nullptr) {
            return head;
        }
        
        // Update the previous node's next pointer
        if (current->prev != nullptr) {
            current->prev->next = current->next;
        }
        
        // Update the next node's prev pointer
        if (current->next != nullptr) {
            current->next->prev = current->prev;
        }
        
        delete current;
        return head;
    }
};