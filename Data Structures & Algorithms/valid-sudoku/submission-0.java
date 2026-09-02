class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
         for (int i =0;i<9;i++){
            set.clear();
            for (int j =0;j<9;j++){
                if (board[i][j] !='.') {
                     if(!set.add(board[i][j] )){
                        return false ;
                        }
                    }
                }
        }
        for (int i =0;i<9;i++){
            set.clear();
            for (int j =0;j<9;j++){
                if (board[j][i] !='.') {
                     if(!set.add(board[j][i] )){
                        return false; 
                        }
                    }
                }
        }
        for(int i =0;i<9;i+=3){
            for(int j =0;j<9;j+=3){
                set.clear();
                for(int k = i;k<i+3;k++){
                    for(int l = j;l<j+3;l++){
                       
                    if (board[k][l] !='.') {
                     if(!set.add(board[k][l] )){
                        return false ;
                        }
                    }
                }
                }
                    }
                }
                return true;
            }
        }

        
        
    

