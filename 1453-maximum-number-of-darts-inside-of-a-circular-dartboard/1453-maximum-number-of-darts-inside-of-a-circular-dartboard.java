class Solution {
    public int numPoints(int[][] darts, int r) {
        int n = darts.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dx = darts[j][0] - darts[i][0];
                double dy = darts[j][1] - darts[i][1];
                double d = Math.sqrt(dx * dx + dy * dy);

                if (d > 2 * r) continue;

                double mx = (darts[i][0] + darts[j][0]) / 2.0;
                double my = (darts[i][1] + darts[j][1]) / 2.0;
                double h = Math.sqrt((double) r * r - (d / 2) * (d / 2));
                double ox = h * dy / d;
                double oy = -h * dx / d;

                ans = Math.max(ans, count(darts, r, mx + ox, my + oy));
                ans = Math.max(ans, count(darts, r, mx - ox, my - oy));
            }
        }
        return ans;
    }

    private int count(int[][] darts, int r, double cx, double cy) {
        int cnt = 0;
        for (int[] p : darts) {
            double dist = Math.sqrt((cx - p[0]) * (cx - p[0]) + (cy - p[1]) * (cy - p[1]));
            if (dist <= r + 1e-7) cnt++;
        }
        return cnt;
    }
}   