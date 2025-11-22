class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = n( u(x1, x2), u(x3,x4) );
        return answer;
    }
    
    public boolean u(boolean x1, boolean x2) {
        if ( x1 || x2 ) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean n(boolean x1, boolean x2) {
        if ( x1 && x2 ) {
            return true;
        }
        else {
            return false;
        }
    }
}