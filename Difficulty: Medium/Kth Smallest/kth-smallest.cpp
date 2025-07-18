// User function template for C++
class Solution {
public:
    int partition(vector<int>& arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                ++i;
                swap(arr[i], arr[j]);
            }
        }
        swap(arr[i + 1], arr[high]);
        return i + 1;
    }

    int quickSelect(vector<int>& arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);
            if (pi == k) {
                return arr[pi];
            } else if (pi > k) {
                return quickSelect(arr, low, pi - 1, k);
            } else {
                return quickSelect(arr, pi + 1, high, k);
            }
        }
        return -1; // Should never reach here if inputs are valid
    }

    int kthSmallest(vector<int>& arr, int k) {
        return quickSelect(arr, 0, arr.size() - 1, k - 1);
    }
};
