#ifndef __STRING_TEST__
#define __STRING_TEST__

class String
{
public:
	String(const char* cstr = 0);			//����һ��ָ��

	//Big Three �������⺯��
	String(const String& str);				//�������죺�Զ��壬����һ���������͵�String����
	String& operator=(const String& str);   //������ֵ���Զ��壬��ֵһ���������͵�String����
	~String();								//��������   ����ʱ����1.�����뿪������

	inline char* get_c_str() const { return m_data; }   //inline�ؼ��ֿ���ʡ�� ��ü� �������� ���Ա�����Ӧ�û���Ϊinline
														//��Ϊ����ı�m_data ���ָ�� ���� const �������Ǽ�

private:
	char* m_data;                 //�ַ����ڲ����� ��һ��ָ��   ָ��һ���ڴ�ռ�
								  //�����Ǵ�һ������ ��һ��������ַ�������
};


/*
C / C++
�ַ�����ʾ��
ָ��ָ��һ���ڴ��ַ��ͷ�� ĩβ��\0�����������

���� �ַ������ȱ�ʾ��
1. ָ��ָ���ڴ��ַ ĩβ��\0 �� ��һ����0��, C/C++ �� \0 �������������  ���Լ��������  (�� C/C++)
2. ָ��ָ���ڴ��ַ ǰ����һ�����ȵ�ֵ  ���磬pascal��

*/
inline 
String::String(const char* cstr = 0)
{
	//��̬�����ڴ棬һ��������ָ�룬һ����Ҫ���ж�̬����
	if (cstr) {
		m_data = new char[strlen(cstr) + 1];		//+1 ��ʾ����һ���������� \0   new��������һ��m_dataָ��ָ����ڴ�ռ䣬 ���� = ������ַ������� + 1
		strcpy(m_data, cstr);
	}
	else {
		m_data = new char[1];
		*m_data = '\0';								//�ַ���ʾ�Ľ�������
	}
}

inline 
String::~String()
{
	//��Ϊ���ڶ�̬������ڴ棬Ϊ�˱����ڴ�й¶����Ҫ�������������������������ڴ�
	delete[] m_data;								//delete vs delete[]      https://www.runoob.com/note/15971
													//delete ptr -- ���������ͷ��ڴ棬��ֻ�����ͷ�ptrָ����ڴ档
													//delete[] rg -- �����ͷ�rgָ����ڴ棬��������һ����������ÿ������� destructor����
}


//��������
inline 
String::String(const String& str)
{
	m_data = new char[ strlen(str.m_data) + 1 ];			//ֱ������һ��object��private ���ݣ���Ϊ����֮�以Ϊ��Ԫ
	strcpy(m_data, str.m_data);
}


//������ֵ ��copy assignment operator��
inline 
String& String::operator+=(const String& str)
{
	if (this == &str)										//������Ҹ�ֵ ��self assignment��
		return *this;										//��Ϊ�ǳ�Ա���� ���Ի���this pointer����    
															//str�Ǵ�������� �� ������ ����ͨ��ȡ��ַ& ��ȡ�����ַ

	delete[] m_data;										//ɾ��Ŀ�걻��ֵ�������е� 
	m_data = new char[ strlen(str.m_data) + 1 ];			//����һ���㹻��Ŀռ� �͸�ֵ���󳤶�һ�� �� ���� ĩβ���
	strcpy(m_data, str.m_data);								//������ֵ���󵽱���ֵ������
	return *this;
}


/*
1. ���ָ�룬���еĿ���������Ҫ�Զ��壬����ʹ�ñ��������õģ��������졢������ֵ��
2. ָ���뿪��������Ҫɾ����
����
������ scope
{
	String s1();								//�뿪������ʱ���������������
	String s2("hello");							//�뿪������ʱ���������������

	String* p = new String("hello");
	delete p;									//�뿪������ʱ ��Ҫɾ��ָ��p    �뿪������ʱ���������������
}

3.class with pointer members (��ָ���Ա����) ������ copy ctor (��������) �� copy op= (������ֵ)
������Զ��� copy ctor �� copy op=  ���ʹ�ñ������ṩ�Ŀ����͸�ֵ����

1�����ܳ����ڴ�й¶
����
String a("hello");  //hello\0
String b("world");	//world\0

ʹ��default copy ctor ���� default copy op= 
b = a;  //a��b��ָ�� hello\0		b��Ϊ����alias					��������ָ��ָ��ͬһ�������޸�һ������Ӱ������      
		//world\0����ڴ��û��ָ��ָ�� й¶��
		//���� ǳ����   ������Ĭ���ṩ�ķ�ʽ


4. ��� vs. ǳ����
���������һ���µ��ڴ�ռ䣬������������ȥ
ǳ�������������µ��ڴ�ռ䣬ֻ�ǿ���ָ��
����
String s1("hello");
String s2(s1);
//String s2 = s1;  //����s2 ��s1��ֵ��s2  ��ͬ�ڿ�����ֵ


5. ������ֵ ������ ���Ҹ�ֵ����� 
1�����Ч��
2����Ϊ������ֵ ��һ������ɾ��Ŀ�걾�� ������������Ҹ�ֵ ���޷����еڶ�������
����
{
	String s1("hello");
	String s2(s1);
	s2 = s1;
}





*/


#endif // !__STRING_TEST__
