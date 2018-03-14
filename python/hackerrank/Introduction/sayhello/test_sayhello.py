import unittest, sys, sayhello
from io import StringIO

class TestSayHello(unittest.TestCase):
    def test_helloworld(self):
        out = StringIO()
        sys.stdout = out
        sayhello.main()
        self.assertEqual(out.getvalue().strip(), "Hello, World!")

if __name__=='__main__':
    unittest.main()
