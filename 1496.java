Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
  
Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.
  
  ========sol===============
  class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        Set<String> v=new HashSet<>();
        v.add("0,0");
        for(char d:path.toCharArray()){
            if(d=='E') x++;
            else if(d=='W') x--;
            else if(d=='N') y++;
            else  y--;    
        String cp=x+","+y;
        if(v.contains(cp))
          return true;
         v.add(cp);
        }
        return false;  
    }
}
