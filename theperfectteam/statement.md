### The Perfect Team
The School of Languages and Science teaches five subjects: Physics, Chemistry, Math,
Botany, and Zoology. Each student is skilled in one subject. The skills of the students
are described by string of named skills that consists of the letters p, c, m, b, and z
only. Each character describes the skill of a student.

Given a list of students' skills, determine the total number of different teams
satisfying the following constraints:

• A team consists of a group of exactly five students.
• Each student is skilled in a different subject.
• A student may only be on one team.

#### Example 1
skills = pcmbzpcmbz

There are 2 possible teams that can be formed at one time: skills[0-4] = pcmbz and
skills[5-9] = pcmbz, for example.

#### Example 2
skills = mppzbmbpzcbmpbmczcz

The sorted string is bbbbcccmmmmppppzzzz. All of the skills are represented, but
there are only 3 students skilled in Chemistry. Only 3 teams can be created.

#### Function Description

Complete the function different Teams in the editor below. The function must return
an integer value representing the number of teams that can be formed given the
constraints.

different Teams has the following parameter(s):

_string skills_: a string of length in where each position represents the skill of a
student

Constraints

* 5≤n≤5x100
* skills[i] are in the set {p,c,m,b,z}