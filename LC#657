There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
==============SOL============

class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
                if(moves.charAt(i)=='L'){
                 l++;}
                if(moves.charAt(i)=='R'){
                 r++;}
                if(moves.charAt(i)=='U'){
                 u++;}
                if(moves.charAt(i)=='D'){
                 d++;}
        }
        if(l==r && u==d){
           return true;}
        return false;   
    } 
}
