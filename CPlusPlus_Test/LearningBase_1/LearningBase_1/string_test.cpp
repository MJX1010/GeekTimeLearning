
#include <iostream>
#include "string_test.h"
using namespace std;

ostream& 
operator << (ostream& os, const String& str)
{
	//cout �ܽ��յ� c string pointer ����ӡstring����
	os << str.get_c_str();
	return os;
}

