import java.util.Random;

public class Project06 {
    public static void main(String[] args) {
        int maxVote = 0;
        Election[] election = new Election[4];

        election[0] = new Election("이재명", 0);
        election[1] = new Election("윤석열", 0);
        election[2] = new Election("심상정", 0);
        election[3] = new Election("안철수", 0);

        for (int i = 1; i <= 10000; i++) {
            System.out.print("[투표진행율]");
            Random random = new Random();
            int vote = random.nextInt(4);

            int electionVote = election[vote].getVote()+1;
            election[vote].setVote(electionVote);

            System.out.println(String.format("%d명 투표 =>%s",i,election[vote].getName()));

            System.out.println(String.format("[기호 1] 이재명: %.2f%%, (투표수: %d)",((float)election[0].getVote()/i*100),election[0].getVote()));
            System.out.println(String.format("[기호 2] 윤석열: %.2f%%, (투표수: %d)",((float)election[1].getVote()/i*100),election[1].getVote()));
            System.out.println(String.format("[기호 3] 심상정: %.2f%%, (투표수: %d)",((float)election[2].getVote()/i*100),election[2].getVote()));
            System.out.println(String.format("[기호 4] 안철수: %.2f%%, (투표수: %d)",((float)election[3].getVote()/i)*100,election[3].getVote()));

        }

        for (int i =0; i < election.length; i++){
            if(maxVote == election[i].getVote()){
                System.out.println("당선자가 동률이 발생하여 다시 진행해주시기 바랍니다.");
                return;
            }
            maxVote = Math.max(maxVote,election[i].getVote());
        }

        for (int i =0; i < election.length; i++){
            if(maxVote == election[i].getVote()){
                System.out.println(String.format("[투표결과] 당선인: %s",election[i].getName()));
            }
        }
    }

    public static class Election{
        String name = "";
        int vote = 0;

        int maxVote = 0;

        public Election(String name, int vote){
            this.name = name;
            this.vote = vote;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getVote() {
            return vote;
        }

        public void setVote(int vote) {
            this.vote = vote;
        }
    }
}
