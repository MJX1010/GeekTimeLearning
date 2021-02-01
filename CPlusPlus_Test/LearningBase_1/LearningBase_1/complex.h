//ͷ�ļ�����ʽ����

//��ʽ1. �ɱ������ṩ��֤  ͬһ�ļ����ᱻ�������
#pragma once  

//��ʽ2. ����ʽ  ����ʽ  ����  guard
#ifndef __COMPLEX__
#define __COMPLEX__

/*
�������ļ��

1. ���ݶ�����private
2. ��������ͨ��reference����  ����������Ƿ���Ҫ��const �����ȿ��Ǵ������ã�
3. ����ֵ����ͨ��reference����							�����ȿ��Ǵ������ã�
4. �����еĺ��� �ܼ�const�ľ�����
5. ���캯������ʹ�ó�ʼ��





*/




//ǰ������

#include <cmath>

class ostream;
class complex;

complex&
	__doapl(complex* ths, const complex& r);




//������
class complex										//class head
{													//class body start

//access level���ʼ���  ���Խ���д ��һ����Ҫд��������
public:
	//ctor :  ��������Я��Ĭ��ֵ Ĭ��ʵ��
	complex(double r = 0, double i = 0)
		: re(r), im(i)							   //��ʼ�У���ֵ��(initialization list)  Ч�ʸ��� �ڹ��캯���ڲ����и�ֵ���� ������ʼֵ assignments��
												   //������ֵ�������׶Σ���ʼ���� ��ֵ
	{}

	//complex() : re(0), im(0) {}				   //������캯���������Ĭ��ֵ�� �޷�ͬʱ����  �����Ϻ�������

	complex& operator += (const complex&);		   //����-���ô��� (������ to const ���ᱻ���շ��޸�Ӱ������) 
												   //����ֵ���ݣ����ô���

	//�������������ܿ��ܻᱻ�����������inline
	double real() const { return re; }			   //const  λ����() �� {} ֮��
	double imag() const { return im; }			   //����  ����������ı��������� ���const ��ȡ�����в��� ��������Ҫȡ�� ����Ҫ�ı�

	//����
	void real(double r) { re = r; }


	//test friend func
	//int func(const complex& param) { return param.re + param.im; } // ͬһ��class�ĸ���object �˴˻�Ϊ��Ԫ 	c2.func(c1);

//���ݾ�������private
private:
	double re, im;

protected:
	double test;

	friend complex& __doapl(complex*, const complex&); //��Ԫ ���Լӵ�������   ���������������ȡ�� friend �� private�ĳ�Ա
														//Ҳ����ͨ���������������ݣ� ��û��ֱ���ÿ죬 ����friend�����˷�װ������

};

//��չ��ģ����
/*
//ģ������ T
template<typename T>
class complex
{
public:
	complex(T r = 0, T i = 0)
		: re(r), im(i)
	{}
	complex& operator += (const complex&);
	T real() const { return re; }
	T imag() const { return im; }

private:
	T re, im;

	friend complex& __doapl(complex*, const complex&);
};

//ģ��ʹ��
{
	complex<T> c1(2.5, 1.5);
	complex<T> c2(2, 6);
}
*/


//��չ������������inline�� ִ��Ч�ʸ� 
//���壺������class body�ڶ�����ɣ����Զ���Ϊinline��ѡ�������������ѡ��
//����̫���� ���ܾ��޷�������������Ϊinline
//������class body �ⶨ��ģ������ڲ�ʵ�ּ򵥣�����������inline �����ѡ
/*
inline double imag(const complex& x)
{
	return x.imag();
}*/


//��չ�����캯��
//���涼�Ǵ�������ķ�ʽ
/*
complex c1(2, 1);
complex c2;
complex* p = new complex(4);
*/

//����ѹ��캯������private�� �������ǵ���ģʽ Singleton
/*
class A {
public:
	static A& getInstance();
	setup() {...}

private:
	A();
	A(const A& rhs);
	...
};

A& A::getInstance()
{
	static A a;
	return a;
}

����
A::getInstance().setup();

*/

//��չ����������(overloading) ���������캯��
//������ʵ�����Ʋ�һ��
//�������س������ڹ��캯��
//���������������Ĭ��ֵ��Ҫע���û�в����ĺ����ܲ��ܹ�������


//��չ��const ����
/*
	const complex c1(2, 1); //����һ��const ����
	cout << c1.real();      //real() ��Ҫconst ����
	cout << c1.imag();	    //imag() ��Ҫconst ����
*/


//��չ�� ��������
//pass by value vs. pass by reference(to const)
//���þ���ͨ��ָ��ʵ�ֵ�
//�������þ��Ǵ���ָ�� Ч�ʿ�
//c++ ���� ����ȫ����������������
//���� ����������� ��������˵Ĳ�ȷ���޸� ��Ӱ�촫�ݷ�  ����ѡ�� ���� reference (to const)
//ϸ���� �������ֻ��һ�����ֽڣ���ָ�����ĸ��ֽڣ��ǿ��Դ���ֵ�ķ�ʽ

//��չ�� ����ֵ����
//return by value vs. return by reference(to const)
//����ֵ�Ĵ���Ҳ������������


//ʲô����¿��Դ�ֵ ʲô����¿��Դ�����
/*
����������������У���Ҫ������ʱ���������ݣ���������ʱ����ʱ����Ӧ�ñ����ݵ��ⲿ�����ã���������²��ܴ�������
�����Ĳ��� ���һ�����ᱻ�Ķ� �ڶ��������ᱻ�Ķ� ��Ҫ���ڶ��������ӵ���һ������ʱ ���Դ�������


//���������ݲ������������
//���1����������������ݴ�ŵ�ĳ��������
inline complex&
__doapl(complex* ths, const complex& r)
{
	ths->re += r.re;
	ths->im += r.im;
	return *ths;
}
//���2�����������¿ռ��Ų����������
//������ c3�����������ں�������ʱ�Ѿ����� ��local���� ���ܰ����ô���ȥ
inline complex&
__doapl(complex* ths, const complex& r)
{
	complex c3;
	c3.real(r.re);
	return c3;
}
*/


//��չ: ��Ԫ
//ͬһ��class�ĸ���object �˴˻�Ϊ��Ԫ
//����int func(const complex& param) { return param.re + param.im; }  ֱ���ó�Ա
//    c2.func(c1);


//��չ������������
//������ʵ����һ������
//���ַ�ʽ
/*
1. ��Ա����




*/






//�ඨ��


#endif