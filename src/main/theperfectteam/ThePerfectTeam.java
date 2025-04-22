package src.main.theperfectteam;

import java.util.HashMap;
import java.util.Map;

class ThePerfectTeam {
    private static final int REQUIRED_SKILLS_BY_TEAM = 5;

    public static void main(String[] args) {
        System.out.println(perfectTeam("bbbbcccmmmppppzzzz"));;
    }

    public static int perfectTeam(String skills) {
        char[] skillsChar =  skills.toCharArray();
        Map<Character, Integer> skillsCount = new HashMap<>();

        int smallTeamCount = 0;

        for (char skill : skillsChar) {
            if (!skillsCount.containsKey(skill)) {
                skillsCount.put(skill, 1);
                continue;
            }

            int count = skillsCount.get(skill) + 1;
            skillsCount.put(skill, count);
        }

        if (skillsCount.size() < REQUIRED_SKILLS_BY_TEAM) return 0;

        for (char skill : skillsCount.keySet()) {
            int count = skillsCount.get(skill);
            if (smallTeamCount == 0 || count < smallTeamCount) {
                smallTeamCount = count;
            }
        }

        return smallTeamCount;
    }

}