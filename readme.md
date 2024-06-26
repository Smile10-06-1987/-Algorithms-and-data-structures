
**Красно-чёрное дерево**

Красно-чёрное дерево - это форма сбалансированного двоичного дерева поиска, где каждый узел содержит дополнительную информацию о цвете: красный или черный. Эта структура данных была разработана для обеспечения эффективного выполнения операций вставки, удаления и поиска, а также для гарантии логарифмической временной сложности этих операций.

Основные свойства красно-чёрного дерева:

* Каждая нода имеет цвет (красный или черный).
* Корень дерева всегда черный.
* Новая нода всегда красная.
* Красные ноды могут быть только левым дочерним элементом.
* У красной ноды все дочерние элементы черного цвета.

Tree (Дерево) Этот класс представляет собой основную структуру красно-чёрного дерева. Внутренний класс Node представляет узел дерева, содержащий значение, ссылки на левого и правого потомков, а также цвет узла. Для определения цвета узла используется перечисление Color, где представлены два возможных цвета: черный и красный.

Методы:

1. insert: Метод вставки нового элемента в красно-чёрное дерево. Если дерево уже содержит корень, то вызывается приватный метод insert, который рекурсивно вставляет элемент и балансирует дерево после вставки. Если дерево пустое, создается новый узел и он становится корнем дерева.

2. find: Метод поиска элемента в дереве по его значению. Реализован поиск по значению с использованием рекурсии, начиная с корня дерева.

3. balance: Метод балансировки дерева. Внутри него реализованы операции проверки и исправления нарушений условий красно-чёрного дерева.

4. swapColors: Метод для смены цвета узлов дерева. Вызывается в случае, когда оба дочерних узла узла node являются красными.

5. leftRotate: Метод для выполнения левого поворота вокруг узла node.

6. rightRotate: Метод для выполнения правого поворота вокруг узла node.






