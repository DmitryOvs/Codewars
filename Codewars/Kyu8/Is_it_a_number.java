public class Is_it_a_number {

        public boolean isDigit(String s)
        {
            int n = 0;
            String d = s.trim();
            try {
                int g = Integer.parseInt(d);
                n = 1;
            }catch (NumberFormatException nfe)
            {
                n = 2;
            }
            try {
                float g = Float.parseFloat(d);
                n = 1;
            }catch (NumberFormatException nfe)
            {
                n = 2;
            }
            return n == 1;
        }

    }
