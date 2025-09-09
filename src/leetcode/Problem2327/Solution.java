class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1]; // dp[i] = # of people who learn the secret on day i
        dp[1] = 1; // Day 1: one person knows the secret

        for (int day = 2; day <= n; day++) {
            // People who can share today:
            // They must have learned between [day - forget + 1, day - delay]
            for (int k = day - forget + 1; k <= day - delay; k++) {
                if (k >= 1) {
                    dp[day] = (dp[day] + dp[k]) % MOD;
                }
            }
        }

        // At the end of day n, count all people who still remember
        long ans = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) {
                ans = (ans + dp[i]) % MOD;
            }
        }

        return (int) ans;
    }
}
