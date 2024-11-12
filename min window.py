def min_window_substring(strArr):
    N, K = strArr
    if not N or not K:
        return ""

    
    char_count_K = {}
    for char in K:
        char_count_K[char] = char_count_K.get(char, 0) + 1

    required = len(char_count_K)
    left = 0
    right = 0
    formed = 0
    window_counts = {}
    min_length = float('inf')
    start = 0

    
    while right < len(N):
        char = N[right]
        window_counts[char] = window_counts.get(char, 0) + 1

        if char in char_count_K and window_counts[char] == char_count_K[char]:
            formed += 1

    
        while left <= right and formed == required:
            char = N[left]

            if right - left + 1 < min_length:
                min_length = right - left + 1
                start = left

            window_counts[char] -= 1
            if char in char_count_K and window_counts[char] < char_count_K[char]:
                formed -= 1

            left += 1

        right += 1

    return "" if min_length == float('inf') else N[start:start + min_length]


N = input().strip()
K = input().strip()
result = min_window_substring([N, K])

print(result)
