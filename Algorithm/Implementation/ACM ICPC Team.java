public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
    List<Integer> result=new ArrayList<>(2);
  int m=topic.get(0).length();
  int n=topic.size();
  int maxSkills = 0;
  int maxSkillTeams = 0;
  for(int i=0;i<n;i++){
      for(int j = i+1; j < n; j++)
            {
                String member1 = topic.get(i);
                String member2 = topic.get(j);
                int skillSet = 0;
                for(int k = 0; k < m; k++)
                {
                    if(member1.charAt(k) == '1' || member2.charAt(k) == '1')
                    {
                        skillSet++;
                    }
                }

                maxSkillTeams += (maxSkills == skillSet) ? 1 : 0;
                
                if(skillSet > maxSkills)
                {
                    maxSkillTeams = 1;
                    maxSkills = skillSet;
                }
                }
  }
  result.add(0,maxSkills);
  result.add(1,maxSkillTeams);
  return result;
    }