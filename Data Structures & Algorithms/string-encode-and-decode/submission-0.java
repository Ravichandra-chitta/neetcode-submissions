class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // Length of the next string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the string
            result.add(str.substring(j + 1, j + 1 + len));

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return result;
    }
}