class A:
    def __init__(self):
        pass
    def show(self):
        print("Hello1")

class B:
    def __init__(self):
        pass
    def show(self):
        print("Hello2")

class C(A, B):
    pass

c = C()
c.show()