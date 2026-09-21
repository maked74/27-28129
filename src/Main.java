//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    try (BufferedReader br = new BufferedReader(new FileReader("28129_B.txt")))
    {
        int iCount =  Integer.parseInt(br.readLine()); // количество чисел
        int[] data = new int[iCount]; // массив чисел
        int d = 160;
        int p = 7;

        String line;
        int k = 0;
        while ((line = br.readLine()) != null)  // читаем файл построчно и заполняем массив
        {
            data[k] = Integer.parseInt(line);
            k++;
        }

        int sum = 0;
        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < iCount; i++)
            for  (int j = i + 1; j < iCount; j++)
            {


                if((data[i] % p == 0 || data[j] % p == 0) && (data[i] % d != data[j] % d))
                {
                    if (sum < data[i] + data[j])
                    {
                        sum = data[i] + data[j];
                        d1 = data[i];
                        d2 = data[j];
                    }
                }
            }
        IO.println(d1 + " " + d2);

    }
    catch (IOException e)
    {
        IO.println(e.getMessage());
    }
}
