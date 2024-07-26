class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int hNum = 0;
        int wNum = 0; 
        String select = board[h][w]; 
        
        
        if(board.length== 1&&board[h].length==1){
            hNum = 0;
            wNum = 0;
        }else{
        if(h >=0 && h< board.length){
            
            if(h == 0){
                if(board[h+1][w].equals(select)){
                    hNum = hNum+1;
                }
            }else if(h > 0 && h < board.length-1){
                if(board[h-1][w].equals(select)){
                    hNum = hNum+1;
                    if(board[h+1][w].equals(select)){
                        hNum = hNum+1;
                    }
                }else if(board[h+1][w].equals(select)){
                    hNum = hNum+1;
                    if(board[h-1][w].equals(select)){
                        hNum = hNum+1;
                    }
                }
            }else if(h == board.length-1){
                if(board[h-1][w].equals(select)){
                    hNum = hNum+1;
                }
            }  
                
        }
        if(w>=0 && w<board[h].length){
            if((w == 0)){
                if(board[h][w+1].equals(select)){
                     wNum = wNum+1;
                }
            }else if(w>0 && w<board[h].length-1){
                if(board[h][w+1].equals(select)){
                    wNum = wNum+1;
                    if(board[h][w-1].equals(select)){
                        wNum = wNum+1;
                    }
                }else if(board[h][w-1].equals(select)){
                    wNum = wNum+1;
                    if(board[h][w+1].equals(select)){
                        wNum = wNum+1;
                    }
                }
            }else if(w == board.length-1){
                if(board[h][w-1].equals(select)){
                    wNum = wNum+1;
                }
            } 
        }
        }
        int answer = wNum + hNum;
        
        
        
        return answer;
    }
}
