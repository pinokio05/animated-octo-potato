class Test{
    private String name;
    private int id;

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
}
    class rio{
        public static void main(String []args){
            Test T1=new Test();
            T1.setName("tiimmy");
            T1.setId(8973);
            System.out.println(T1.getName());
            System.out.println(T1.getId());

        }
    }
