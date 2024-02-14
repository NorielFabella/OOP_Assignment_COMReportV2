    import java.util.*;
    import java.io.*;


    public class BlockSectionDA
    {
        

        public BlockSectionDA() throws FileNotFoundException
        {
            // Scans blockSection.csv file
            Scanner blockSectionInfo = new Scanner(new FileReader("blockSection.csv"));

            

            while(blockSectionInfo.hasNext())
            {
                // Declares rowBlockSection
            String rowBlockSection = new String();

            // Reads the entire row of blockSection then put it in rowBlockSection
            rowBlockSection = blockSectionInfo.nextLine();

            // Declares rowBlockSectionSpecific
            String[] rowBlockSectionSpecific = new String[3];

            // Puts data in array string
            rowBlockSectionSpecific = rowBlockSection.split(",");

        
            // Declares BlockSection object
            BlockSection blockSection = new BlockSection();

            
            // Puts data in BlockSection
            blockSection.setBlockCode(rowBlockSectionSpecific[0].trim());
            blockSection.setDescription(rowBlockSectionSpecific[1].trim());
            blockSection.setAdviser(rowBlockSectionSpecific[2].trim());

            
            
            

            

            

            // Declares StudentDA object
            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            Student student = new Student();

            

            // Attaches the student list
            blockSection.setStudentList(studentDA.getStudentList());

            blockSection.setTotalStudents(studentDA.getStudentList().size());

            
            

            // Displays the content of BlockSection object
            System.out.println(blockSection);
            


                
            }
            

            

            
            

            




        }
    
    }