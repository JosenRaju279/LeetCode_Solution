public class SumofAllOddLengthSubarrays {
    int n = arr.length;

    int[] prefix = new int[n + 1];

    // Build prefix sum
    for(
    int i = 0;i<n;i++)
    {
        prefix[i + 1] = prefix[i] + arr[i];
    }

    int answer = 0;

    for(
    int start = 0;start<n;start++)
    {
        for (int end = start; end < n; end++) {

            int length = end - start + 1;

            if (length % 2 == 1) {
                int sum = prefix[end + 1] - prefix[start];
                answer += sum;
            }
        }
    }

    return answer;
}
