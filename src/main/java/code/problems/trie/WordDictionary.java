package code.problems.trie;

/*
Problem:
Design a data structure that supports adding new words and finding if a string matches any previously added string.

Implement the WordDictionary class:

WordDictionary() Initializes the object.
void addWord(word) Adds word to the data structure, it can be matched later.
bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.

Constraints:
1 <= word.length <= 25
word in addWord consists of lowercase English letters.
word in search consist of '.' or lowercase English letters.
There will be at most 2 dots in word for search queries.
At most 104 calls will be made to addWord and search.
 */
public class WordDictionary {

    TrieNode root;

    public WordDictionary(){
        root = new TrieNode();
    }

    public void addWord(String word){
        TrieNode curr = root;

        for(char c: word.toCharArray()){
            if(!curr.children.containsKey(c)){
                curr.children.put(c, new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.endOfWord = true;
    }

    public boolean search(String word){
        return _dfs(0, root, word);
    }

    private boolean _dfs(int index, TrieNode root, String word){
        TrieNode curr = root;

        for(int i = index; i < word.length(); i++){
            char c = word.charAt(i);

            if(c == '.'){
                for(TrieNode child: curr.children.values()){
                    if(_dfs(i+1, child, word)){
                        return true;
                    }
                }
                return false;
            }
            else{
                if(!curr.children.containsKey(c)){
                    return false;
                }
                curr = curr.children.get(c);
            }
        }
        return curr.endOfWord;
    }
}
