public void whenAppendToFileUsingFileWriter_thenCorrect()
  throws IOException {
 
    FileWriter insertion = new FileWriter(fileName, true);
    BufferedWriter insertion = new BufferedWriter(insertion);
    insertion.write("Praveen");
    insertion.newLine();
    insertion.close();
    
    assertThat(getStringFromInputStream(
      new FileInputStream(fileName)))
      .isEqualTo("PK\r\n" + "GK\r\n" + "Germany\r\n" + "Spain\r\n");
}
