class Solution {
public:
    bool is_feasible(const std::vector<int>& arr, int k, int max_pages) {
        int students = 1, current_pages = 0;
        for (int pages : arr) {
            if (current_pages + pages > max_pages) {
                students++;
                current_pages = pages;
                if (students > k) return false;
            } else {
                current_pages += pages;
            }
        }
        return true;
    }

    int findPages(std::vector<int>& arr, int k) {
        if (arr.size() < k) return -1;

        int left = *std::max_element(arr.begin(), arr.end());
        int right = std::accumulate(arr.begin(), arr.end(), 0);
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (is_feasible(arr, k, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
};
