package J2SE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {
	
	//前半段数字
	public List<String> getHeadNumber(){
		List<String> list=new ArrayList<String>();
		String lotteryNumber="";
		for(int i=1;i<36;i++){
			if(i<10){
				list.add("0"+i+" ");
			}else{
				list.add(""+i+" ");
			}
		}
		int roundIndex=0;
		List<String> lotterylist=new ArrayList<String>();
		for(int j=0;j<5;j++){
			//获取list的大小后，随机产生0-34的数字，第一个肯定是这个数加一(因为顺序)，但是因为去除了第一回合的数字，所以第二轮开始，list的顺序被打乱，然后随机产生的数就不再是第一回合那样，加个一了，变成随机了。
			int amount=list.size();
			Random r=new Random();
			roundIndex=r.nextInt(amount);
			lotteryNumber=list.get(roundIndex);
			lotterylist.add(lotteryNumber);
			list.remove(roundIndex);
		}
		Collections.sort(lotterylist);
		return lotterylist;
		
	}
	//后半段数字
	public List<String> getRearNumber(){
		List<String> list=new ArrayList<String>();
		String lotteryNumber="";
		for(int i=1;i<13;i++){
			if(i<10){
				list.add("0"+i+" ");
			}else{
				list.add(""+i+" ");
			}
		}
		int roundIndex=0;
		List<String> lotterylist=new ArrayList<String>();
		for(int j=0;j<2;j++){
			int amount=list.size();
			Random r=new Random();
			roundIndex=r.nextInt(amount);
			lotteryNumber=list.get(roundIndex);
			lotterylist.add(lotteryNumber);
			list.remove(roundIndex);
			//System.out.println("amount:"+amount+"r.nextInt(amount):"+r.nextInt(amount));
		}
		Collections.sort(lotterylist);
		return lotterylist;
		
	}
	public void mm(String groupnum){
		int groupNumber=0;
		groupNumber=Integer.parseInt(groupnum);
		StringBuilder sbuiler=new StringBuilder();
		
		for(int i=0;i<groupNumber;i++){
			List<String> startList=getHeadNumber();
			List<String> endList=getRearNumber();
			for(int m=0;m<startList.size();m++){
				sbuiler.append(startList.get(m));
			}
			sbuiler.append(" ");
			for(int n=0;n<endList.size();n++){
				sbuiler.append(endList.get(n));
			}
			sbuiler.append("\n");
		}
		System.out.println(sbuiler.toString());
		}
}
