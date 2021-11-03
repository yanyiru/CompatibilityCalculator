import java.util.ArrayList;
public class StudentList
{
    private ArrayList<Student> studentList;
    public StudentList(ArrayList<Student> studentList)
    {
        this.studentList = studentList;
    }
    public void compareStudents(int studToComp)
    {
        getTotalSimilarity(studToComp);
    }
    public int getTotalSimilarity(int i)
    {
        ArrayList<Double> percentageList = new ArrayList<Double>();
        for (int j = 0; j<studentList.size();j++)
        {
            if (i != j)
            {
                double nameSim = getNameSimilarity(studentList.get(i).getName(), studentList.get(j).getName());
                
                double gradeSim = getGradeSimilarity(studentList.get(i).getGrade(), studentList.get(j).getGrade());
                
                double gpaSim = getGPASimilarity(studentList.get(i).getGPA(), studentList.get(j).getGPA());
                
                double prefBluejSim = getPrefBluejSimilarity(studentList.get(i).getPrefBluej(), studentList.get(j).getPrefBluej());
                
                double avgSim = (nameSim*gradeSim*gpaSim*prefBluejSim)/4;
                
                percentageList.add(avgSim);
            }
        }
        double highestSim = 0;
        /*for (int k = 0; k<percentageList.size();k++)
        {
            if (highestSim < percentageList.get(k))
            {
                highestSim 
            }
        }*/
        return 0;
    }
    
    public double getNameSimilarity(String studI, String studJ)
    {
        return 0.0;
    }
    public double getGradeSimilarity(int studI, int studJ)
    {
        return 0.0;
    }
    public double getGPASimilarity(float studI, float studJ)
    {
        return 0.0;
    }
    public double getPrefBluejSimilarity(boolean studI, boolean studJ)
    {
        return 0.0;
    }   

}