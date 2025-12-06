class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int [photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            
            answer[i] = 0;
            
            for (int idx = 0; idx < photo[i].length; idx++) {
                
                for (int match = 0; match < name.length; match++) {
                    
                    if (photo[i][idx].equals(name[match])) {
                        answer[i] += yearning[match];
                    }
                    
                }
                
            }
            
        }
        
        return answer;
    }
}