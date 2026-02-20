class father:
    money = 1000
    
    def show(self):
        print("Parent class Instance Method")
    
    @classmethod    
    def showmoney(cls):
        print("Parent class, class method ", cls.money)
    
    @staticmethod    
    def stat():
        a = 10
        print("Parent class static method: ", a)
        
class Son(father):
    def disp(self):
        print("child class inherit method")  
        
s = Son()
s.disp()
s.show()
s.showmoney()
s.stat()  
    