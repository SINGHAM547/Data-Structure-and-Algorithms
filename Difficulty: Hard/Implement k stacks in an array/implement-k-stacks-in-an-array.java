class kStacks {

    private int[] arr;
    private int[] top;
    private int[] next;

    private int freeTop;
    private int k, cap;

    public kStacks(int n, int k) {

        this.k = k;
        this.cap = n;

        arr = new int[n];
        top = new int[k];
        next = new int[n];

        for (int j = 0; j < k; j++) {
            top[j] = -1;
        }

        for (int j = 0; j < n - 1; j++) {
            next[j] = j + 1;
        }

        next[n - 1] = -1;

        freeTop = 0;
    }

    public void push(int x, int i) {

        if (freeTop == -1) {
            return;
        }

        int idx = freeTop;

        freeTop = next[idx];

        next[idx] = top[i];

        top[i] = idx;

        arr[idx] = x;
    }

    public int pop(int i) {

        if (top[i] == -1) {
            return -1;
        }

        int idx = top[i];

        top[i] = next[idx];

        next[idx] = freeTop;

        freeTop = idx;

        return arr[idx];
    }

    public boolean isEmpty(int i) {
        return top[i] == -1;
    }
}