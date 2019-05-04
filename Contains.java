public class Contains
{
    public static boolean contains(String haystack, String needle)
    {
        if(haystack.length() < needle.length())
        {
        return false;
        }
        else
        {
            boolean doesContain=false;
            for(int i = 0; i < needle.length(); i++)
            {
                if(haystack.charAt(i) != needle.charAt(i))
                    if((i + 1) == needle.length())
                        {
                            doesContain = false;
                            break;
                        }
                    else
                        break;
                else
                    if((i + 1) == needle.length())
                    {
                        doesContain = true;
                        break;
                    }
                    else
                        continue;
            }
            char[] haystackChar = haystack.toCharArray();
            char[] newCharArray = new char[(haystackChar.length - 1)];

            for(int j = 1; j < haystackChar.length; j++)
            {
                newCharArray[j - 1] = haystackChar[j];
            }

            String newStr = new String(newCharArray);

            if(doesContain == false)
                return contains(newStr, needle);
            else
                return true;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(contains("Java programming", "ogr"));
        System.out.println(contains("Java programming", "grammy"));
    }
}
