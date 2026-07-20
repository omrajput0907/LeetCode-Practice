class MyCalendar {
    int[][] calendar=new int[1000][2];
    int size;
    public MyCalendar() {
        size=0;
    }
    public boolean book(int startTime, int endTime) {
        for(int i=0;i<size;i++){
            if(startTime<calendar[i][1] && endTime > calendar[i][0]){
                return false;
            }
        }
        calendar[size][0]=startTime;   
        calendar[size][1]=endTime;   
        size++;
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */