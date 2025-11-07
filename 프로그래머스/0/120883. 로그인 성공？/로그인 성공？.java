class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        boolean no_id = false;
        boolean no_pw = false;
        
        for (int i=0; i<db.length; i++) {
            if (id.equals(db[i][0])) {
                no_id = true;
                if (pw.equals(db[i][1])) {
                    no_pw = true;
                }
            }
            
        }
        
        if (no_id==true && no_pw==true) {
            return "login";
        }
        else if (no_id==false) {
            return "fail";
        }
        else {
            return "wrong pw";
        }
    }
}