class SqueakyClean {
    static StringBuilder sb = new StringBuilder();

    static String clean(String identifier) {
        sb.setLength(0);

        boolean upper = false;
        for(char c : identifier.toCharArray()) {
            c = upper ? Character.toUpperCase(c) : c;
            upper = false;
            switch (c) {
                case ' ': sb.append('_');
                    break;
                case '-': upper = true;
                    break;

                case '4': sb.append('a');
                    break;

                case '3': sb.append('e');
                    break;

                case '0': sb.append('o');
                    break;

                case '1': sb.append('l');
                    break;

                case '7': sb.append('t');
                    break;

                default: if (Character.isLetter(c)) sb.append(c);
            }
        }
        return sb.toString();
    }
}