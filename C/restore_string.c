char *restoreString(char *s, int *indices, int indicesSize)
{
    char *new_str;
    for(int i = 0; i < indicesSize; i++){
        for(int j = 0; j < indicesSize-1; j++){
            if(indices[j] > indices[j+1]){
                int temp = indices[j];
                indices[j] = indices[j+1];
                indices[j+1] = temp;

                char temp_char = s[j];
                s[j] = s[j+1];
                s[j+1] = temp_char;
            }
        }
    }
    new_str = &s[0];
    return new_str;
    
    
}
