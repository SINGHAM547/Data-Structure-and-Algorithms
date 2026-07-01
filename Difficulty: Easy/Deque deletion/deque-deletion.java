class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        Iterator<Integer> it = deq.iterator();
        int index=0;
        while(it.hasNext()){
            it.next();
            if(index==X){
                it.remove();
                break;
            }
            index++;
        }
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if(start==end) return;
        Iterator<Integer> it=deq.iterator();
        int index=0;
        while(it.hasNext()){
            it.next();
            if(index>=start && index<end){
                it.remove();
            }
            index++;
        }
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}