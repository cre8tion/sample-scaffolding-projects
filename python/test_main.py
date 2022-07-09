# -*- coding: utf-8 -*-
import unittest

from main import main


class SampleTest(unittest.TestCase):
    def test_hello_world(self):
        self.assertEqual("Hello World!", main())

if __name__ == '__main__':
    unittest.main()
