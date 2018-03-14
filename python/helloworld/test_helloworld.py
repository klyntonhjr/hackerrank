import unittest, sys 
from io import StringIO
from helloworld import *

class TestHelloWorld(unittest.TestCase):
    def test_hello(self):
        self.assertEqual(helloWorld(), 'Hello, World!')
    
    def test_hi(self):
        out = StringIO()
        sys.stdout = out
        hiWorld()
        self.assertEqual(out.getvalue().strip(), 'Hi, World!')

if __name__ == '__main__':
    unittest.main()

