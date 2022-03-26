public class driverTube {
    public static void main(String[] args) {
        SayaTubeVideo vid1 = new SayaTubeVideo("Review Film Start-Up oleh Jeremia Carlo");
        SayaTubeVideo vid2 = new SayaTubeVideo("Review Film Crash Landing On You oleh Jeremia Carlo");
        SayaTubeVideo vid3 = new SayaTubeVideo("Review Film Descendent of the sun oleh Jeremia Carlo");
        SayaTubeVideo vid4 = new SayaTubeVideo("Review Film K2 oleh Jeremia Carlo");
        SayaTubeVideo vid5 = new SayaTubeVideo("Review Film Let's fight ghost oleh Jeremia Carlo");
        SayaTubeVideo vid6 = new SayaTubeVideo("Review Film Love alarm oleh Jeremia Carlo");
        SayaTubeVideo vid7 = new SayaTubeVideo("Review Film Who am I oleh Jeremia Carlo");
        SayaTubeVideo vid8 = new SayaTubeVideo("Review Film School 2017 oleh Jeremia Carlo");
        SayaTubeVideo vid9 = new SayaTubeVideo("Review Film School 2015 oleh Jeremia Carlo");
        SayaTubeVideo vid10 = new SayaTubeVideo("Review Film While you were sleeping oleh Jeremia Carlo");
        vid1.increasePlayCount(25000000);
        vid2.increasePlayCount(25000000);
        vid3.increasePlayCount(25000000);
        vid4.increasePlayCount(25000000);
        vid5.increasePlayCount(25000000);
        vid6.increasePlayCount(25000000);
        vid7.increasePlayCount(25000000);
        vid8.increasePlayCount(25000000);
        vid9.increasePlayCount(25000000);
        vid10.increasePlayCount(25000000);


        SayaTubeUser user1 = new SayaTubeUser("Jeremia Carlo");
        user1.addVideo(vid1);
        user1.addVideo(vid2);
        user1.addVideo(vid3);
        user1.addVideo(vid4);
        user1.addVideo(vid5);
        user1.addVideo(vid6);
        user1.addVideo(vid7);
        user1.addVideo(vid8);
        user1.addVideo(vid9);
        user1.addVideo(vid10);

        user1.printAllVideoPlaycount();
        System.out.println("Total Playcount : "+user1.getTotalVideoPlayCount());
    }
}
