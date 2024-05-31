//O programa lê dados do ficheiro rainfall_data.csv, com o seguinte formato: 
//date,location,rainfall 
//2022-01-01,Lisboa,6.23 
//2022-01-01,Porto,8.14
//Cada linha do ficheiro corresponde a uma leitura de precipitação, com um local, data, e valor. Esta informação é representada através da classe RainfallInfo.Implemente as seguintes operações no código: 1) Leia o conteúdo do ficheiro, guardando o cabeçalho e as restantes linhas (linha 72) 2) Preencha a lista com objetos RainfallInfo, para representar a informação lida do ficheiro (linha 77) 3) Escreva para ecrã os valores de precipitação relativos à cidade \"Porto\" e todas as datas do mês de abril (linha 79) 4) Calcule, e guarde no mapa, as médias de precipitação por local (linha 85) 5) Escreva para ecrã as médias de precipitação por local (linha 88)  O resultado esperado é: 
//File header: date,location,rainfall 
//Number of lines, excluding header: 159 Porto [2022-04-02]: 9.4 Porto [2022-04-09]: 3.8 Porto [2022-04-16]: 7.1 Porto [2022-04-23]: 3.5 Porto [2022-04-30]: 9.8
//Location: Lisboa, Average Rainfall 8.01 
//Location: Porto, Average Rainfall 7.53
//Location: Faro, Average Rainfall 7.52

import java.io.FileReader;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

// ADD MISSING IMPORTS

class RainfallInfo {
    LocalDate date;
    String location;
    double rainfall;
    
    RainfallInfo(LocalDate date, String location, double rainfall) {
        this.date = date;
        this.location = location;
        this.rainfall = rainfall;
        }
        
        LocalDate getDate() {
            return date;
        }

        String getLocation() {
            return location;
        }

        double getRainfall() {
            return rainfall;
        }

        @Override
        public String toString() {
            return location + " [" + date + "] : " + rainfall;
        }
        
            
        public static class RainfallAverages {

            public static void main(String[] args) {
                
                String filePath = "rainfall_data.csv";
                List<String> lines = null;
                String header = null;
                
                try {     
                    Scanner sc = new Scanner(new FileReader(filePath));           
                    // CODE HERE: Read lines from file
                    // CODE HERE: Read header from file
                    lines = new ArrayList<>();
                    while(sc.hasNextLine()) {
                        String line = sc.nextLine();
                        lines.add(line);
                    }
                    header = lines.get(0);
                    lines.remove(0);

                    System.out.printf("File header: ", header);            
                    System.out.printf("Number of lines, excluding header: ", lines==null ? 0 : lines.size());  
                    // avoid null reference
                    List<RainfallInfo> rainfallData = new ArrayList<>();
                    // CODE HERE: Create list of information from file, represented as RainfallInfo objects
                    for (String line : lines) {
                        String[] parts = line.split(",");
                        LocalDate date = LocalDate.parse(parts[0]);
                        String location = parts[1];
                        double rainfall = Double.parseDouble(parts[2]);
                        RainfallInfo info = new RainfallInfo(date, location, rainfall);
                        rainfallData.add(info);
                    }
                    // CODE HERE: Print rainfall values for Porto and dates in April
                    for (RainfallInfo info : rainfallData){
                        String Data = info.getDate().toString();
                        if (info.getLocation().equals("Porto") && Data.startsWith("2022-04-")){ 
                           System.out.println(info);}
                     }                    
                    
                    System.out.println("\n");
                    // Calculate average rainfall per location
                    Map<String, Double> rainfallPerLocation = new HashMap<>();
                    for (RainfallInfo info : rainfallData) {
                        String location = info.getLocation();
                        double rainfall = info.getRainfall();
                        if (rainfallPerLocation.containsKey(location)) {
                            rainfallPerLocation.put(location, rainfallPerLocation.get(location) + rainfall);
                        } else {
                            rainfallPerLocation.put(location, rainfall);
                        }
                    } 

                    // COMPLETE            
                    // CODE HERE: Print average rainfall per location
                    for (String location : rainfallPerLocation.keySet()) {
                        int i = 0, j = 0, k = 0;

                        if (rainfallPerLocation.containsKey("Lisboa")){
                            i++;
                        }
                        if (rainfallPerLocation.containsKey("Porto")){
                            j++;
                        }
                        if (rainfallPerLocation.containsKey("Faro")){
                            k++;
                        }
                        
                                    
                        System.out.println("Location: " + location + ", Average Rainfall " + rainfallPerLocation.get(location)/i+j+k);


        
                        }
                        
                    
                    System.out.println("\n");    
                    sc.close();    
                } catch (Exception e) {  
                    // Workaround to avoid codecheck error. Should be a more specific Exception class.
                                e.printStackTrace();      
                }
            }
        }    
    }