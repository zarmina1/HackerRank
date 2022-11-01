 public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    // Write your code here
    List<Integer> results = new ArrayList<>();
int playerCounter = 0;
int rankCounter = 0;
ranked = ranked
.stream()
.distinct()
.sorted(Comparator.naturalOrder())
.collect(Collectors.toList());
    System.out.println(ranked);
while((playerCounter < player.size()) && (rankCounter < ranked.size()) ){
  if(player.get(playerCounter).compareTo(ranked.get(rankCounter))<0){
    int r=player.get(playerCounter).compareTo(ranked.get(rankCounter));
    System.out.println("r:"+r);
    results.add(ranked.size()-rankCounter+1);
    playerCounter++;
  }
  else{
    if(rankCounter == ranked.size()-1){
      results.add(1);
      playerCounter++;
    }else{
      rankCounter++;      
    }
  }
}
return results;
    }
