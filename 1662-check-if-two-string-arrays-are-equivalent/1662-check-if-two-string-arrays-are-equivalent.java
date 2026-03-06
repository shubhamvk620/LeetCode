class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder W1 = new StringBuilder();
        StringBuilder W2 = new StringBuilder();

        for(int i = 0; i < word1.length; i++){
            W1.append(word1[i]);
        }
        for(int j = 0; j < word2.length; j++){
            W2.append(word2[j]);
        }

        return W1.toString().equals(W2.toString());
    }
}

// return W1.equals(W2); ye wrong hai beck StringBuilder object ka reference compare krta hai na ki content

//so that convert in String