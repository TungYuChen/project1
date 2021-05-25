class Solution {
    public List<String> commonChars(String[] words) {
        int count = 0;
        List<Character> chA = new ArrayList<>();
        List<String> sA = new ArrayList<>();
        char[] ch = new char[100];
        for(String s : words) {
            ch = s.toCharArray();
            if (count == 0) {
                for (char c : ch) {
                    chA.add(c);
                }
            } else {
                for (int i = 0; i < chA.size(); i++) {
                    for (int j = 0; j < ch.length; j++) {
                        if (chA.get(i) == ch[j]) {
                            ch[j] = ' ';
                            break;
                        }
                        if (j == ch.length - 1) {
                            chA.remove(i);
                            i--;
                        }
                    }
                    
                }
            }
            count++;
            
        }
        
        for (char c : chA) {
            sA.add(String.valueOf(c));
        }
        
        return sA;
            
    }
    
}
