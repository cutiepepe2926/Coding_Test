class Solution {
    public String solution(String polynomial) {
        // x변수
        int x_num = 0;
        // 상수
        int num = 0;
        
        // 공백 기준 쫒개기
        String[] split = polynomial.split(" ");
        
        for (int i=0; i<split.length; i++) {
            if (split[i].contains("x")) {
                if (split[i].length() == 1) {
                    x_num += 1;
                }
                else {
                    StringBuilder sb = new StringBuilder();
                    for (int j=0; j<split[i].length()-1; j++) {
                        sb.append(split[i].charAt(j));
                    }
                    x_num += Integer.parseInt(sb.toString());
                }
            }
            else if (split[i].equals("+")) {
                continue;
            }
            else {
                num += Integer.parseInt(split[i]);
            }
        }
        
        if (num==0 && x_num==0) {
            return "0";
        }
        else {
            if (num==0) {
                if (x_num==1) {
                    return "x";
                }
                return x_num+"x";
            }
            else if (x_num==0) {
                return String.valueOf(num);
            }
            else {
                if (x_num==1) {
                    return "x + "+num;
                }
                return x_num+"x + "+num;
            }
        }
    }
}