package com.example.newrecyclerviewapplication.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newrecyclerviewapplication.MainActivity
import com.example.newrecyclerviewapplication.databinding.FragmentHomeBinding
import com.example.newrecyclerviewapplication.model.ChildItemDataClass
import com.example.newrecyclerviewapplication.model.ParentItem
import com.example.newrecyclerviewapplication.viewmodels.MainAdapter


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        _binding = FragmentHomeBinding.inflate(inflater, container, false)



        val activity = activity as MainActivity

//        activity.setBootomNav(false)



//       binding!!.recyclerviewshimmer.visibility = View.VISIBLE
//        binding!!.recyclerviewshimmer.startShimmer()




        val childItem1 = ArrayList<ChildItemDataClass>()
        val parentList1 = ArrayList<ParentItem>()

        childItem1.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/files/challengers_240x360_crop_center.progressive.jpg?v=1708533100",
                "Challengers"
            )
        )

        childItem1.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/files/despicable_me_four_240x360_crop_center.progressive.jpg?v=1708104714",
                "Despicable Me 4"
            )
        )

        childItem1.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/files/back-to-black_1f71bxfo_240x360_crop_center.progressive.jpg?v=1708544506",
                "Back To Black"
            )
        )



        childItem1.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/files/scan_92952849-df3d-4305-9798-5529fc91c78f_240x360_crop_center.progressive.jpg?v=1707837263",
                "Dune"
            )
        )
        childItem1.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/files/scan002_9c68b3af-854e-4da5-8a10-c88b5ca64258_240x360_crop_center.progressive.jpg?v=1707837273",
                "Dune Part Two"
            )
        )


//        parentList1.add(ParentItem(0,"Adventure", childItem1))

        val childItem2 = ArrayList<ChildItemDataClass>()

        childItem2.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/6e03c88b4899bcd9a67a49f295b277d4_aabbd510-a2c3-45c6-8db5-2e9e75ba305d_240x360_crop_center.progressive.jpg?v=1573613711",
                "How to marry a millionaire"
            )
        )

        childItem2.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/2a0a496e8a16c7af95738bcc7f05842c_d7669cf3-7837-4529-a208-88ebcf7b16ed_240x360_crop_center.progressive.jpg?v=1573594827",
                "Don't bother to knock"
            )
        )

        childItem2.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/66a8dbf70e4d072b093c82cbdbfe0e71_d19deab1-6e21-4960-b9f4-e3d044e7e880_240x360_crop_center.progressive.jpg?v=1573585416",
                "Maryline Monroe"
            )
        )
        childItem2.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/e0d57b515ad281ad8dd56a0ab1f667e5_6989c2e7-4110-443b-8690-2d98569208ba_240x360_crop_center.progressive.jpg?v=1573587273",
                "Some Like It Hot"
            )
        )









        val childItem3 = ArrayList<ChildItemDataClass>()


        val childItem4 = ArrayList<ChildItemDataClass>()

        childItem4.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/9b5c94e9d11ddc369da700b87a1b028a_240x360_crop_center.progressive.jpg?v=1573585416",
                "The Shawshank Redemption"
            )
        )
        childItem4.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/c0d5aafbe61d1f1a8f9f7920a3a2ad14_240x360_crop_center.progressive.jpg?v=1573587273",
                "The Godfather"
            )
        )
        childItem4.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/8d9054cfcbadab9d58a545f1bc53c120_240x360_crop_center.progressive.jpg?v=1573613711",
                "The Dark Knight"
            )
        )
        childItem4.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/a5ae5ae1b74d2b920b2a84c19b34a638_240x360_crop_center.progressive.jpg?v=1573594827",
                "Pulp Fiction"
            )
        )

        val childItem5 = ArrayList<ChildItemDataClass>()

        childItem5.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/543b6a7cfb2e9c040f33050cddbc9f1b_240x360_crop_center.progressive.jpg?v=1573585416",
                "Inception"
            )
        )
        childItem5.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/b39dc0d6ff422fd3c77a08a8f3e2f271_240x360_crop_center.progressive.jpg?v=1573587273",
                "The Matrix"
            )
        )
        childItem5.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/27e1ad23bc5f6f7f4eb8df76c6f41e48_240x360_crop_center.progressive.jpg?v=1573613711",
                "Fight Club"
            )
        )
        childItem5.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/5da4cbf4b2a51f828f6c9a7f48f4fd42_240x360_crop_center.progressive.jpg?v=1573594827",
                "The Lord of the Rings"
            )
        )

        val childItem6 = ArrayList<ChildItemDataClass>()

        childItem6.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/7521b4ddbb7b1996b7a32a0618e3c1e1_240x360_crop_center.progressive.jpg?v=1573585416",
                "The Silence of the Lambs"
            )
        )
        childItem6.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/3a5f21e8fb2b80f43b312b49e68fc80f_240x360_crop_center.progressive.jpg?v=1573587273",
                "Forrest Gump"
            )
        )
        childItem6.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/5fc08f08319d2d8a8f1be51dfdcbaa00_240x360_crop_center.progressive.jpg?v=1573613711",
                "Gladiator"
            )
        )
        childItem6.add(
            ChildItemDataClass(
                "https://www.movieposters.com/cdn/shop/products/edc94c2de05a75bba2fc5af5ddab0fd3_240x360_crop_center.progressive.jpg?v=1573594827",
                "The Green Mile"
            )
        )

        val childItem7 = ArrayList<ChildItemDataClass>()

        childItem7.add(
            ChildItemDataClass("https://www.movieposters.com/cdn/shop/products/ed4796ac6feff9d2a6115406f964c928_6b200bda-fe71-4900-ad7f-903cdda50dab_240x360_crop_center.progressive.jpg?v=1573587596",
                "Matrix"
            )
        )
        childItem7.add(
            ChildItemDataClass("https://cdn.shopify.com/s/files/1/0057/3728/3618/products/6cd691e19fffbe57b353cb120deaeb8f_8489d7bf-24ba-4848-9d0f-11f20cb35025_500x749.jpg?v=1573613877",
                "Star Wars"
            )
        )

        childItem7.add(ChildItemDataClass("https://cdn.shopify.com/s/files/1/0057/3728/3618/files/darkknight.building.24x36_20e90057-f673-4cc3-9ce7-7b0d3eeb7d83_500x749.jpg?v=1707491191","The Dark Knight"))

        childItem7.add(ChildItemDataClass("https://www.movieposters.com/cdn/shop/products/abca511947e2be3089c28ee6ade2b072_5bc7a357-f2ab-4ff5-a1bc-878546e3459d_240x360_crop_center.progressive.jpg?v=1573652599","Indiana Jones"))


                        binding !!. mainRecyclerview . setHasFixedSize (true)

                        binding!!. mainRecyclerview.layoutManager = LinearLayoutManager (context)

        val p1 = ParentItem(0,"Popular", childItem2)
        val p2 = ParentItem(1,"Classic", childItem1)
        val p3 = ParentItem(2,"Hollywood", childItem7)
        val p4 = ParentItem(3,"Sci-Fi", childItem2)
        val p5 = ParentItem(4,"You May Like", childItem7)
        val p6 = ParentItem(5,"Classic", childItem1)

                val mainAdapter = MainAdapter()
        mainAdapter.submitList(listOf(p2,p3,p1,p4,p5,p6))



                    binding!!.mainRecyclerview.adapter = mainAdapter

//        parentList1.add(ParentItem(1,"Popular", childItem2))
//
//        Handler(Looper.getMainLooper()).postDelayed( Runnable {
//
////            val p2 = (ParentItem(1, "Classic", childItem7))
////            val p3 = (ParentItem(2, "Hollywood", childItem1))
//
//
//        parentList1 . add (ParentItem(2,"You May Like", childItem1))
//        parentList1 . add (ParentItem(1,"Classic", childItem7))
//
//            mainAdapter.submitList(parentList1)
//        }, 4000 )


                    return _binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}