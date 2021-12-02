package com.neha.gs.one;

import java.util.LinkedList;

public class Election {

    /**
     * A group of students are sitting in a circle. The teacher is selecting a new class president.
     * teacher does thos by singing a song while walking around the circle. after the song is finished
     * the student at which the teacher stopped is removed from the circle.
     * <p>
     * startting to the student next to the one who was remmoved the teacher resumes singing the song
     * walking around the circle, teacher repeates this till one student remains
     * <p>
     * song of length k will have teacher past k students. the syudents are numbered 1 to n.
     * <p>
     * suppose the song length is two (k=2). And there are 4 4 students to start with (1,2,3,4).
     * the first student to go will be 2, then 4, thne 3, student 1 will be winner
     */

    public static int whoIsElected(int n, int k) {
        if (n == 1) return 1;
        return (whoIsElected(n - 1, k) + k - 1) % n + 1;
    }

    public static int whoIsElected2(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        int i = -1;
        while (list.size() > 1) {
            list.remove((i + k) % list.size());
            i = (i + k) % (list.size() + 1) - 1;
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
      System.out.println(whoIsElected(1,1) == 1);
      System.out.println(whoIsElected(4,2) == 1);
      System.out.println(whoIsElected(100,2) == 73);
      System.out.println(whoIsElected(5,3) == 4);
    }
}
