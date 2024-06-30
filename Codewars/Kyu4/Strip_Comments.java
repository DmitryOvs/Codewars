public class Strip_Comments {

    public static String stripComments(String text, String[] commentSymbols) {
        if (text.isEmpty()) {
            return null;
        }

        final StringBuilder sb = new StringBuilder();
        final String[] lines = text.split("\n");

        for (int i = 0; i < lines.length; i++) {
            final String s = lines[i];
            final StringBuilder helper = new StringBuilder();
            int commentStartPosition = s.length();

            if (commentStartPosition !=0) {
                for (String comment : commentSymbols) {
                    if (s.contains(comment)) {
                        commentStartPosition = Math.min(commentStartPosition, s.indexOf(comment));
                    }
                }
                helper.append(s, 0, commentStartPosition);
            }

            while (!helper.isEmpty() && helper.charAt(helper.length() - 1) == ' ') {
                helper.setLength(helper.length() - 1);
            }

            helper.append("\n");
            sb.append(helper);
        }

        if (!sb.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }

        return new String(sb);
    }
}