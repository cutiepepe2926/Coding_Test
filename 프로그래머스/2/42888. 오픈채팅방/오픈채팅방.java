import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        // change hashmap 만들기
        // leave든 enter든 리스트 형태로 저장해놓기 앞에서부터 채우기
        // hashmap에 해당 uid가 있는지는 매번 체크해야겟지?
        
        // 그냥 먼저 순회해서 유저리스트 만들면되는거 아님?
        
        HashMap<String, String> userList = new HashMap<>(); // 유저아이디 - 닉네임 매칭용
        
        ArrayList<String> result = new ArrayList<>(); 
        
        for (int i = 0; i < record.length; i++) {
            
            String[] temp = record[i].split(" ");
            
            if (temp.length == 2 ) {
                continue;
            }
            
            userList.put(temp[1], temp[2]);
            
        }
        
        
        for (int i = 0; i < record.length; i++) {
            
            StringBuilder sb = new StringBuilder();
            
            String[] temp = record[i].split(" ");
            
            
            if (temp.length == 2) { // 나가기
                sb.append(userList.get(temp[1]));
                sb.append("님이 나갔습니다.");
                result.add(sb.toString());
            }
            
            else if (temp.length == 3 && temp[0].equals("Enter")) { // 입장
                sb.append(userList.get(temp[1]));
                sb.append("님이 들어왔습니다.");
                result.add(sb.toString());
            }
            
            else { 
                continue;
            }
            
        }
        
        
        // 결과값 형 요구사항에 맞게 반환
        String[] answer = new String[result.size()];
        
        int idx = 0;
        
        for (String s : result) {
            answer[idx++] = s;
        }
        
        return answer;
    }
}