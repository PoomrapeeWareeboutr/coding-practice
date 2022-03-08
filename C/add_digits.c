int addDigits(int num){
  int unit;
  int sum = 0;
  while(num != 0){
    unit = num % 10;
    num /= 10;
    sum += unit;
  }
  num = sum;
  if(num >= 10){
    return addDigits(num);
  }
  else{
    return num;
  }
}
