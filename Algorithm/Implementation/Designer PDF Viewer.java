  public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here

int maxheight=0;
for(int i=0;i<word.length();i++){
    if(maxheight<h.get(word.charAt(i)-97)){
          maxheight=h.get(word.charAt(i)-97);
    }
}
int result=maxheight*word.length();
return result;
    }