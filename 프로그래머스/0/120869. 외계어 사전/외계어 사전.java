class Solution {
    public int solution(String[] spell, String[] dic) {
        int word_length = spell.length;
        for (int d=0; d<dic.length; d++) {
            if (dic[d].length()!=word_length) {
                dic[d] = "^";
            }
            else {
                //spell 중 하나에 대해서
                int ok = 1;
                for (int s=0; s<spell.length; s++) {
                    int cnt = 0;
                    // 단어수만큼 체킹
                    for (int i=0; i<word_length; i++) {
                        //spell에 해당되는 경우
                        if ( String.valueOf(dic[d].charAt(i)).equals(spell[s]) ) {
                            cnt++;
                        }
                    }
                    // 아예 없거나 중복인 경우
                    if (cnt>1 || cnt==0) {
                        ok = 0;
                    }
                }
                if (ok==0) {
                    dic[d] = "^";
                }
            }
        }
        int answer = 2;
        for (int i=0; i<dic.length; i++) {
            if (!dic[i].equals("^")) {
                return 1;
            }
        }
        return answer;
        
    }
}