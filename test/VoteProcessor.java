import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		
		int pope = 0;
		int ed = 0;
		
		for(int i = 0; i < votes.size(); i++){
			if(votes.get(i).equalsIgnoreCase("pope francis")){
				pope++;
			}
			else{
				ed++;
			}
		}
			if(ed > pope){
				System.out.println("ed");
				return "edward snowden";
			}
			else if(pope > ed){
				System.out.println("pope");
				return "pope francis";
			}
			else{
				System.out.println("tie");
				return "TIE";
			}
	}
	

}
